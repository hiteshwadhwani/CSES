package java_cses;

public class SegmentTree {
    class Node {
        int data;
        int leftInterval;
        int rightInterval;
        Node left;
        Node right;

        Node(int leftInterval, int rightInterval) {
            this.leftInterval = leftInterval;
            this.rightInterval = rightInterval;
        }
    }

    Node root;

    SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    public Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node node = new Node(start, end);
            node.data = arr[start];
            return node;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
      }
      private int query(Node node, int qsi, int qei) {
        if(node.leftInterval >= qsi && node.rightInterval <= qei) {
          // node is completely lying inside query
          return node.data;
        } else if (node.leftInterval > qei || node.rightInterval < qsi) {
          // completely outside
          return 0;
        } else {
          return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
      }

    public static void main(String[] args) {
        SegmentTree tree = new SegmentTree(new int[] { 2, 4, 8, 10, 12, -6, -4, 8 });
        int res = tree.query(0, 6);
        System.out.print(res);
    }
}
