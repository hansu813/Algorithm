package src.비선형자료구조.그래프;

/**
 * packageName    : src.비선형자료구조.그래프
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 인접 리스트를 이용한 그래프 구현
 */
class Node01 {
    int id;
    Node01 next;

    public Node01(int id, Node01 next) {
        this.id = id;
        this.next = next;
    }
}

class MyGraphList {
    char[] vertices;
    Node01[] adjList;
    int elemCnt;

    public MyGraphList() {
    }

    public MyGraphList(int size) {
        this.vertices = new char[size];
        this.adjList = new Node01[size];
        this.elemCnt = 0;
    }

    public boolean isFull() {
        return this.elemCnt == this.vertices.length;
    }

    public void addVertex(char data) {
        if (isFull()) {
            System.out.println("Graph is full!");
            return;
        }

        this.vertices[elemCnt++] = data;
    }

    public void addEdge(int x, int y) {
        this.adjList[x] = new Node01(y, this.adjList[x]);
        this.adjList[y] = new Node01(y, this.adjList[y]);
    }

    public void addDirectedEdge(int x, int y) { // 양방향 그래프의 경우
        this.adjList[x] = new Node01(y, this.adjList[x]);
    }

    public void printAdjacentList() {
        for(int i = 0; i < this.elemCnt; i++) {
            System.out.print(this.vertices[i] + ": ");

            Node01 cur = this.adjList[i];
            while(cur != null) {
                System.out.print(this.vertices[cur.id] + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }
}

public class Practice01 {
    public static void main(String[] args) {
        // Test code
        MyGraphList graph = new MyGraphList(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        graph.printAdjacentList();
    }
}
