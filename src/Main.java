import searchalgorithm.Algorithms;
import searchalgorithm.Node;
import undirectedgraph.Graph;
import undirectedgraph.Romenia;
import undirectedgraph.Vertex;

import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {
    Graph graph = Romenia.defineGraph();
    graph.showLinks();
    graph.showSets();
    Node n;
    String[] p = new String[2];
    p[0] = "Dobrogea";
    p[1] = "Banat";
    n = graph.searchSolution3("Arad", "Bucharest",p , Algorithms.AStarSearch);
    graph.showSolution(n);

    }





}


//BreadthFirstSearch
//Node Expansions: 8
//Nodes Generated: 21
//State Repetitions: 4
//Runtime (ms):  4,650
//| Arad      |    0 | [Arad, Sibiu] -> 221
//| Sibiu     |  221 | [Sibiu, Fagaras] -> 65
//| Fagaras   |  286 | [Fagaras, Bucharest] -> 180
//| Bucharest |  466 |


//DepthFirstSearch
//Node Expansions: 3
//Nodes Generated: 9
//State Repetitions: 1
//Runtime (ms):  4,881
//| Arad      |    0 | [Arad, Sibiu] -> 221
//| Sibiu     |  221 | [Sibiu, Fagaras] -> 65
//| Fagaras   |  286 | [Fagaras, Bucharest] -> 180
//| Bucharest |  466 |

//GreedySearch
//Node Expansions: 4
//Nodes Generated: 14
//State Repetitions: 0
//Runtime (ms):  2,825
//| Arad      |    0 | [Arad, Sibiu] -> 221
//| Sibiu     |  221 | [Sibiu, R. Vilcea] -> 79
//| R. Vilcea |  300 | [R. Vilcea, Pitesti] -> 47
//| Pitesti   |  347 | [Pitesti, Bucharest] -> 108
//| Bucharest |  455 |


//AStarSearch
//Node Expansions: 4
//Nodes Generated: 14
//State Repetitions: 0
//Runtime (ms):  3,319
//| Arad      |    0 | [Arad, Sibiu] -> 221
//| Sibiu     |  221 | [Sibiu, R. Vilcea] -> 79
//| R. Vilcea |  300 | [R. Vilcea, Pitesti] -> 47
//| Pitesti   |  347 | [Pitesti, Bucharest] -> 108
//| Bucharest |  455 |

//UniformCostSearch
//Node Expansions: 12
//Nodes Generated: 31
//State Repetitions: 17
//Runtime (ms):  4,438
//| Arad      |    0 | [Arad, Sibiu] -> 221
//| Sibiu     |  221 | [Sibiu, R. Vilcea] -> 79
//| R. Vilcea |  300 | [R. Vilcea, Pitesti] -> 47
//| Pitesti   |  347 | [Pitesti, Bucharest] -> 108
//| Bucharest |  455 |