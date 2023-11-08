import java.util.*;

public class graph {

        static class edge {
                int src;
                int dest;

                public edge(int src, int des) {
                        this.src = src;
                        this.dest = dest;
                }
        }

        public static void createGraph(ArrayList<edge>[] graph) {
                for (int i = 0; i < graph.length; i++) {
                        graph[i] = new ArrayList<edge>();
                }
                graph[0].add(new edge(0, 1));
                graph[0].add(new edge(0, 2));
                graph[0].add(new edge(0, 3));

                graph[1].add(new edge(1, 0));
                graph[1].add(new edge(1, 2));

                graph[2].add(new edge(2, 0));
                graph[2].add(new edge(2, 1));

                graph[3].add(new edge(3, 0));
                graph[3].add(new edge(3, 4));
                // graph[3].add(new edge(3, 5));

                graph[4].add(new edge(4, 3));

        }

        static void getAP(ArrayList<edge>[] graph, int v) {
                int[] dt = new int[v];
                int[] low = new int[v];
                boolean[] isVisited = new boolean[v];
                boolean[] ap = new boolean[v];

                int time = 0;

                for (int i = 0; i < v; i++) {
                        if (isVisited[i] == false) {
                                dfs(graph, i, -1, isVisited, ap, time, dt, low);
                        }
                }

                for (int i = 0; i < v; i++) {
                        if (ap[i] == false) {
                                System.out.println( i);
                        }
                }

        }

        static void dfs(ArrayList<edge>[] graph, int curr, int par, boolean[] isVisited, boolean[] ap, int time, int[] dt, int[] low) {

                isVisited[curr] = true;
                dt[curr] = low[curr] = ++time;
                int children = 0;

                for(int i =0; i<graph[curr].size(); i++){
                        edge e = graph[curr].get(i);

                        if(e.dest==par) continue;
                        else if(isVisited[e.dest]) low[curr] = Math.min(low[curr], low[e.dest]);
                        else{
                                dfs(graph, e.dest, curr, isVisited, ap, time, dt, low);
                                low[curr] = Math.min(low[curr], dt[e.dest]);
                                if(dt[curr]<=low[e.dest]&& par!=-1) ap[curr] = true;
                                children++;

                        }

                        if(par==-1&&children>1) ap[curr] = true;
                }
               

        }

        public static void main(String[] args) {
                int v = 5;
                ArrayList<edge>[] graph = new ArrayList[v];
                createGraph(graph);
                getAP(graph, v);

        }
}