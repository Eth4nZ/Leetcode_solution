package _815_bus_routes

/**
 * Created by eth4 on 08/04/18.
 */

class BusRoutes {
//
//    val visited = Array(MAX_V, {false})
//
//    class Node<T>(var value: T) {
//        var next: Node<T>? = null
//    }
//
//    val graph = ArrayList<Node<Int>>()
//    fun numBusesToDestination(routes: Array<IntArray>, S: Int, T: Int): Int {
//        for (route in routes) {
//            for (i in 0 until route.lastIndex)
//
//            graph[route.last()][route[0]] = 1
//        }
//
//        for (i in 0..graph.lastIndex) {
//            for (j in 0..graph[i].lastIndex)
//                print(graph[i][j].toString() + " ")
//            println()
//        }
//
//
//        return dfs(graph, S, T, 1)
//    }
//
//    fun addNode(index: Int) {
//        if (graph.contains())
//        val head =
//        while()
//
//    }
//
//    fun dfs(graph: Array<IntArray>, node: Int, T: Int, cur: Int): Int {
//        visited[node] = true
//        for (i in 0..MAX_V-1) {
//            if (graph[node][i] != 0 && !visited[i]) {
//                if (i == T) {
//                    println(cur)
//                    return cur
//                }
//                dfs(graph, i, T, cur + 1)
//            }
//        }
//        return -1
//    }

//    dfs(vertex v)
//    {
//        visit(v);
//        for each neighbor w of v
//        if w is unvisited
//        {
//            dfs(w);
//            add edge vw to tree T
//        }
//    }




//
//val MAX_V = 500
//    fun _numBusesToDestination(routes: Array<IntArray>, S: Int, T: Int): Int {
//        val graph = Array<IntArray>(MAX_V, { IntArray(MAX_V, {0}) })
//        for (route in routes) {
//            for (i in 0 until route.lastIndex)
//                graph[route[i]][route[i + 1]] = 1
//            graph[route.last()][route[0]] = 1
//        }
//
//    }
//
//
//
//    fun dijkstra(graph: Array<IntArray>, src: Int, T: Int): Int {
//        val dist = IntArray(MAX_V) // The output array. dist[i] will hold
//        // the shortest distance from src to i
//
//        // sptSet[i] will true if vertex i is included in shortest
//        // path tree or shortest distance from src to i is finalized
//        val sptSet = arrayOf<Boolean>()
//
//        // Initialize all distances as INFINITE and stpSet[] as false
//        for (i in 0 until MAX_V) {
//            dist[i] = Integer.MAX_VALUE
//            sptSet[i] = false
//        }
//
//        // Distance of source vertex from itself is always 0
//        dist[src] = 0
//
//        // Find shortest path for all vertices
//        for (count in 0 until MAX_V - 1) {
//            // Pick the minimum distance vertex from the set of vertices
//            // not yet processed. u is always equal to src in first
//            // iteration.
//            val u = minDistance(dist, sptSet)
//
//            // Mark the picked vertex as processed
//            sptSet[u] = true
//
//            // Update dist value of the adjacent vertices of the
//            // picked vertex.
//            for (v in 0 until MAX_V)
//
//            // Update dist[v] only if is not in sptSet, there is an
//            // edge from u to v, and total weight of path from src to
//            // v through u is smaller than current value of dist[v]
//                if (!sptSet[v] && graph[u][v] != 0 &&
//                        dist[u] != Integer.MAX_VALUE &&
//                        dist[u] + graph[u][v] < dist[v])
//                    dist[v] = dist[u] + graph[u][v]
//        }
//
//        // print the constructed distance array
//        return dist[T]
//    }
//
//    fun minDistance(dist: IntArray, sptSet: Array<Boolean>): Int {
//        // Initialize min value
//        var min = Integer.MAX_VALUE
//        var min_index = -1
//
//        for (v in 0 until MAX_V)
//            if (sptSet[v] == false && dist[v] <= min) {
//                min = dist[v]
//                min_index = v
//            }
//
//        return min_index
//    }
}
