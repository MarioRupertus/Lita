package edu.mil.cet002.compraslita;

public class DijkstraAuto {

    private int[] distancia; // Se usará para almacenar la distancia del origen hasta todos los restantes puntos. Las posiciones son iguales a la lista de mapa
    private boolean[] flag; // Se usará para almacenar si los nodos fueron visitados

    public int[] calcularDistTodos(Nodo origen, Mapa mapa, int auto) {
        System.out.println("COMENZANDO DIJKSTRA");
        reiniciarPesoAcumulado(mapa); // pone en cero los pesos acumulados porque si antes se habia ejecutado otro dijkstra, los nodos van a tener los valores de la consulta anterior
        int cantNodos = mapa.getMapa().size(); // variable auxiliar para acortar consulta al tamaño de mapa
        distancia = new int[cantNodos]; // Dimensiono el vector distancia con el mismo tamaño que la cantidad de nodos en el mapa
        flag = new boolean[cantNodos];// Lo mismo para el vector flag

        iniciarFlag(mapa);

        iniciarDistancia(origen, mapa, auto); //VERSION AUTO AGREGA PARAMETRO

        Nodo nodoActual;
        int posMin;

        while (!isTodosVisitados()) { // Repite la busqueda hasta que todos los puntos esten visitados

            // Busca la primer posicion sin visitar. Arranca en cero y va aumentando hasta que encuentra una sin visitar.
            posMin = 0;
            while (flag[posMin]) {
                posMin++;
            }

            System.out.println("Primero sin visitar " + posMin);

            // La primera posicion sin visitar nos dará el valor con el cual empezamos a comparar (posMin)
            for (int indiceNodo = 0; indiceNodo < distancia.length; indiceNodo++) { // Buscar el nodo mas cercano para dirigirnos y que no haya visitado
                System.out.println("Comparando distancia[" + indiceNodo + "]=" + distancia[indiceNodo] + " VS posMin[" + posMin + "] = " + distancia[posMin]);
                if (!flag[indiceNodo] && distancia[indiceNodo] < distancia[posMin]) {
                    System.out.println("Nuevo minimo encontrado");
                    posMin = indiceNodo;
                }

            }
            System.out.println("Nodo a dirigirse: " + mapa.getMapa().get(posMin).getNombre());

            // Me paro en el nodo que encontré como sin visitar y de menor distancia
            nodoActual = mapa.getMapa().get(posMin); //auxiliar
            flag[posMin] = true; // lo marco como visitado

            // Tengo que recorrer los vecinos del nodo actual y comparar (peso acum nodo actual + distancia al vecino) con peso acumulado del vector distancia
            int indiceNodo;
            for (Proximos proximo : nodoActual.getVecinos()) {
                indiceNodo = 0; //para cada vecino reinicio el indice para comenzar a buscarlo desde la primera posicion del mapa
                // Busco en que posicion de DISTANCIA se encuentra el vecino
                while (!mapa.getMapa().get(indiceNodo).equals(proximo.getnodoVecino())) { // mapa y distancia tienen el mismo orden por lo tanto recorro mapa para buscar en que posicion esta el nodo actual
                    indiceNodo++;
                }
                System.out.print("El vecino " + mapa.getMapa().get(indiceNodo).getNombre() + " se encuentra en la posicion " + indiceNodo + "... ");

                // Comparo DISTANCIA con nuevo recorrido
                System.out.print("1) SENTIDO AL VECINO " + proximo.getSentido() + " 2) Comparo peso acumulado nodo actual " + nodoActual.getPesoAcumulado() + " + costo al vecino " + proximo.getCosto() + " vs distancia temporal al vecino " + distancia[indiceNodo] + "... "); // EN VERSION "AUTO" SE AGREGA Q ADEMAS DE MENOR TAMBIEN SENTIDO TIENE Q SER 1
                if ((proximo.getSentido() == 1) && ((nodoActual.getPesoAcumulado() + proximo.getCosto()) <= distancia[indiceNodo])) { //si la nueva distancia es menor VERSION DOS AGREGO MENOR O IGUAL
                    System.out.print("Menor o igual distancia encontrada --> Se guarda en vector distancia y en atributo pesoAcumulado");
                    distancia[indiceNodo] = (nodoActual.getPesoAcumulado() + proximo.getCosto()); // guarda la nueva distancia
                    proximo.getnodoVecino().setAntecesor(nodoActual); //en el nuevo destino guardo el antecesor
                    proximo.getnodoVecino().setPesoAcumulado(distancia[indiceNodo]);
                }
                System.out.println("");
            }
            imprimirFlag();
            imprimirDistancia();
            imprimirPesoAcumulado(mapa);
            System.out.println("");
        }

        imprimirDistancias(mapa, origen);
        return distancia;
    }

    private void reiniciarPesoAcumulado(Mapa mapa) {
        for (Nodo nodo : mapa.getMapa()) {
            nodo.setPesoAcumulado(0);
        }
    }

    private void iniciarFlag(Mapa mapa) {
        System.out.println("");
        System.out.println("INICIANDO FLAG");
        int cantNodos = mapa.getMapa().size(); // variable auxiliar para acortar consulta al tamaño de mapa
        for (int indiceNodo = 0; indiceNodo < cantNodos; indiceNodo++) { // Este for completa todo el vector FLAG con false (al inicio son todos nos visitados)
            flag[indiceNodo] = false;
        }
        imprimirFlag();
    }

    private void iniciarDistancia(Nodo origen, Mapa mapa, int auto) {
        System.out.println("");
        System.out.println("INICIANDO DISTANCIA");
        Nodo auxVecino;
        Boolean auxVecinoEncontrado;
        int auxCosto = 9999;

        int cantNodos = mapa.getMapa().size(); // variable auxiliar para acortar consulta al tamaño de mapa
        for (int indiceNodo = 0; indiceNodo < cantNodos; indiceNodo++) { // Este for completa el vector DISTANCIA con el costo inicial desde el origen al resto de los puntos
            System.out.print("Distancia[" + indiceNodo + "] ");
            auxVecino = mapa.getMapa().get(indiceNodo); // variable para acortar
            System.out.print("Buscando si " + auxVecino.getNombre() + " es vecino y puede ir en auto desde el nodo " + origen.getNombre() + "... ");
            auxVecinoEncontrado = false; // auxiliar utilizado en el siguiente ciclo. Cuando encuentro un vecino se vuelve true

            for (int indiceVecino = 0; indiceVecino < origen.getVecinos().size(); indiceVecino++) { // para cada punto del mapa, se fija si se encuentra en los vecinos del nodo origen. Es mejor cambiarlo por WHILE y ADEMAS EN LA VERSION "AUTO" VERIFICA QUE SENTIDO SEA 1 (ES DECIR, PUEDE IR EN AUTO)
                if (origen.getVecinos().get(indiceVecino).getnodoVecino().equals(auxVecino) && (origen.getVecinos().get(indiceVecino).getSentido() == 1)) {
                    auxVecinoEncontrado = true;
                    auxCosto = origen.getVecinos().get(indiceVecino).getCosto();
                }
            }

            if (auxVecinoEncontrado) { // Si el nodo mapa[indiceNodo] está dentro de los vecinos del nodo origen:
                distancia[indiceNodo] = auxCosto; // Seteo que la distancia en la pos indiceNodo es igual al costo de ir hasta el vecino mapa[indiceNodo]  de la lista vecinos
                System.out.println("Vecino costo " + distancia[indiceNodo]);
            } else if (origen.equals(auxVecino)) { // Si mapa[indiceNodo] es igual al nodo de origen la distancia será 0
                distancia[indiceNodo] = 0;
                System.out.println("Igual a origen costo " + distancia[indiceNodo]);
            } else {
                distancia[indiceNodo] = 9999; // Si mapa[indiceNodo] no es vecino del origen, seteamos en distancia[indiceNodo] un valor alto para luego comparar con los costos que vayamos encontrando
                System.out.println("No es vecino costo " + distancia[indiceNodo]);
            }
        }
        imprimirDistancia();
    }

    private boolean isTodosVisitados() {
        System.out.println("");
        System.out.print("Chequeando si estan todos los nodos visitados... resultado: ");
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) { // si alguna posicion del flag es false, retorna false
                System.out.println("FALSO");
                return false;
            }
        }
        System.out.println("TRUE -> DIJKSTRA FINALIZADO");
        return true; // si supera el for es porque todo esta visitado, en ese caso retorna true
    }

    private void imprimirDistancias(Mapa mapa, Nodo origen) {
        for (int indiceNodo = 0; indiceNodo < mapa.getMapa().size(); indiceNodo++) {
            //System.out.println("Desde " + origen.getNombre() + " hasta " + mapa.getMapa().get(indiceNodo).getNombre() + " la distancia minima es " + distancia[indiceNodo]);
            System.out.println("Desde " + origen.getNombre() + " hasta " + mapa.getMapa().get(indiceNodo).getNombre() + " la distancia minima es " + mapa.getMapa().get(indiceNodo).getPesoAcumulado());
        }
    }

    private void imprimirFlag() {
        System.out.print("Flag = ");
        for (boolean visitado : flag) {
            if (visitado) {
                System.out.print("| T ");
            } else {
                System.out.print("| F ");
            }
        }
        System.out.println("");
    }

    private void imprimirDistancia() {
        System.out.print("Distancia = ");
        for (int valorDistancia : distancia) {
            System.out.print("| " + valorDistancia + " ");
        }
        System.out.println("");
    }

    private void imprimirPesoAcumulado(Mapa mapa) {
        System.out.print("Peso acumulado ");
        for (Nodo nodo : mapa.getMapa()) {
            System.out.print("| " + nodo.getPesoAcumulado());
        }
    }

    public int[] getDistancia() {
        return distancia;
    }
}
