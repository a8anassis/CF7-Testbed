package gr.aueb.cf.ch19;

public class Main {

    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem();
        System.out.println(item);
    }
}
