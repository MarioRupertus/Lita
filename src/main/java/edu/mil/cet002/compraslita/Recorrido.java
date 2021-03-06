package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    //ATRIBUTOS NECESARIOS PARA FUNCIONAR
    private Nodo origen;
    private Nodo destinoFinal;
    private List<Nodo> destinoIntermedio;
    private Mapa mapa;
    private int auto;

    //ATRIBUTOS CALCULADOS POR DIJKSTRA
    private List<Nodo> recorridoCompleto = new ArrayList<>();
    private int costoTotal;

    public Recorrido(Nodo origen, Nodo destinoFinal, List<Nodo> destinoIntermedio, Mapa mapa, int auto) {
        this.origen = origen;
        this.destinoFinal = destinoFinal;
        this.destinoIntermedio = destinoIntermedio;
        this.mapa = mapa;
        this.auto = auto;
    }

    public Recorrido(Mapa mapa) {
        this.mapa = mapa;
        destinoIntermedio = new ArrayList<>();
    }

    public void setDestinoIntermedio(List<Nodo> destinoIntermedio) {
        this.destinoIntermedio = destinoIntermedio;
    }

    public List<Nodo> getRecorridoCompleto() {
        return recorridoCompleto;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setDestinoFinal(Nodo destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public Nodo getOrigen() {
        return origen;
    }

    public Nodo getDestinoFinal() {
        return destinoFinal;
    }

    public int getAuto() {
        return auto;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public List<Nodo> getDestinoIntermedio() {
        return destinoIntermedio;
    }

    public void agregarDestino(Nodo nodo) {
        destinoIntermedio.add(nodo);
    }

    private int[] calcularMapa(Nodo nodo) { //Calcula la distancia a todos los puntos
        Dijkstra d = new Dijkstra();
        int[] distancia = d.calcularDistTodos(nodo, this.mapa);
        return distancia;
    }

    private int[] calcularMapaAuto(Nodo nodo) { //Calcula la distancia a todos los puntos
        DijkstraAuto d = new DijkstraAuto();
        int[] distancia = d.calcularDistTodos(nodo, this.mapa, this.auto);
        return distancia;
    }

    public List<Nodo> calcularRecorrido() { // Calcula el recorrido entre nodo y destino
        Nodo proxNodo, nodoObjetivo, nodoActual;
        List<Nodo> camino = new ArrayList<>();
        nodoActual = origen;

        while (!isTodosVisitados()) {
            calcularMapa(nodoActual); // Calculo el mapa para el nodo que estoy posicionado
            nodoObjetivo = buscarNodoCercano(); // Busco el destino mas cercano sin visitar
            costoTotal += nodoObjetivo.getPesoAcumulado();
            System.out.println("Distancia del trayecto " + nodoObjetivo.getPesoAcumulado());

            proxNodo = nodoObjetivo;
            camino.add(proxNodo); // el camino se arma desde fin hacia inicio, por lo tanto agrego el nodo objtivo al recorrido

            proxNodo = parcheInstanciaNodo(proxNodo);

            while (proxNodo.getIdnodo() != nodoActual.getIdnodo()) { // mientras el proximo nodo a  visitar sea diferente al nodo de inicio
                proxNodo = proxNodo.getAntecesor(); // agrego al recorrido el antecesor del nodo que estaba en la vuelta anterior
                camino.add(proxNodo);
            }

            almacenarRecorrido(camino);
            imprimirRecorrido();
            nodoActual = nodoObjetivo; // ahora me posiciono en el nodo que visité y repito el proceso desde este nodo   
        }

        // LA ULTIMA ITERACION SE PRODUCE PARA IR A LA POSICION FINAL
        calcularMapa(nodoActual);
        nodoObjetivo = destinoFinal;
        costoTotal += nodoObjetivo.getPesoAcumulado();

        proxNodo = nodoObjetivo;
        camino.add(proxNodo);

        proxNodo = parcheInstanciaNodo(proxNodo);

        while (proxNodo != nodoActual) {
            proxNodo = proxNodo.getAntecesor();
            camino.add(proxNodo);
        }
        almacenarRecorrido(camino);
        imprimirRecorrido();
        camino.clear();

        // FIN DE ARMADO DEL RECORRIDO
        imprimirRecorrido();
        System.out.println("Costo total = " + costoTotal);
        return recorridoCompleto;
    }

    public List<Nodo> calcularRecorridoAuto() { // Calcula el recorrido entre nodo y destino
        Nodo proxNodo, nodoObjetivo, nodoActual;
        List<Nodo> camino = new ArrayList<>();
        nodoActual = origen;

        while (!isTodosVisitados()) {
            calcularMapaAuto(nodoActual); // Calculo el mapa para el nodo que estoy posicionado
            nodoObjetivo = buscarNodoCercano(); // Busco el destino mas cercano sin visitar
            costoTotal += nodoObjetivo.getPesoAcumulado();
            System.out.println("Distancia del trayecto " + nodoObjetivo.getPesoAcumulado());

            proxNodo = nodoObjetivo;
            camino.add(proxNodo); // el camino se arma desde fin hacia inicio, por lo tanto agrego el nodo objtivo al recorrido

            proxNodo = parcheInstanciaNodo(proxNodo);

            while (proxNodo.getIdnodo() != nodoActual.getIdnodo()) { // mientras el proximo nodo a  visitar sea diferente al nodo de inicio
                proxNodo = proxNodo.getAntecesor(); // agrego al recorrido el antecesor del nodo que estaba en la vuelta anterior
                camino.add(proxNodo);
            }

            almacenarRecorrido(camino);
            imprimirRecorrido();
            nodoActual = nodoObjetivo; // ahora me posiciono en el nodo que visité y repito el proceso desde este nodo   
        }

        // LA ULTIMA ITERACION SE PRODUCE PARA IR A LA POSICION FINAL
        calcularMapaAuto(nodoActual);
        nodoObjetivo = destinoFinal;
        costoTotal += nodoObjetivo.getPesoAcumulado();

        proxNodo = nodoObjetivo;
        camino.add(proxNodo);

        proxNodo = parcheInstanciaNodo(proxNodo);

        while (proxNodo != nodoActual) {
            proxNodo = proxNodo.getAntecesor();
            camino.add(proxNodo);
        }
        almacenarRecorrido(camino);
        imprimirRecorrido();
        camino.clear();

        // FIN DE ARMADO DEL RECORRIDO
        imprimirRecorrido();
        System.out.println("Costo total = " + costoTotal);
        return recorridoCompleto;
    }

    private void almacenarRecorrido(List<Nodo> camino) {
        int indiceNodo = camino.size() - 1; //en "camino" los nodos se ordenan de final a inicio por lo tanto lo recorremos hacia atras y vamos agregando a la lista de recorrido total
        int ultimo;

        while (indiceNodo >= 0) {
            recorridoCompleto.add(camino.get(indiceNodo));
            ultimo = recorridoCompleto.size() - 1;
            if (recorridoCompleto.size() > 1) {
                if (recorridoCompleto.get(ultimo).equals(recorridoCompleto.get(ultimo - 1))) {
                    recorridoCompleto.remove(ultimo);
                }
            }
            indiceNodo--;
        }
        camino.clear();
    }

    private Nodo buscarNodoCercano() {
        int posMin = 0;
        while (destinoIntermedio.get(posMin).isVisitado()) {
            posMin++;
        }
        for (int indiceNodo = 0; indiceNodo < destinoIntermedio.size(); indiceNodo++) {
            if (!destinoIntermedio.get(indiceNodo).isVisitado() && destinoIntermedio.get(indiceNodo).getPesoAcumulado() < destinoIntermedio.get(posMin).getPesoAcumulado()) {
                posMin = indiceNodo;
            }
        }
        destinoIntermedio.get(posMin).setVisitado(true);
        return destinoIntermedio.get(posMin);
    }

    private boolean isTodosVisitados() {
        for (Nodo destino : destinoIntermedio) {
            if (!destino.isVisitado()) {
                return false;
            }
        }
        return true;
    }

    private void imprimirRecorrido() {
        System.out.println("");
        System.out.println("Recorrido desde " + origen.getNombre() + " hasta " + destinoFinal.getNombre());

        for (Nodo nodo : recorridoCompleto) {
            System.out.print(nodo.getNombre() + " -> ");
        }
    }

    private Nodo parcheInstanciaNodo(Nodo nodo) {
        //Busca en que posicion del mapa esta el nodo introducido por parametro y devuelve el mismo nodo pero de los instanciados en mapa (Dijkstra graba datos en mapa)
        int aux = mapa.getMapa().indexOf(nodo);
        return mapa.getMapa().get(aux);
    }
}
