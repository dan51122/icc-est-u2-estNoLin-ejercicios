package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                level.add(current);

                if (current.getLeft() != null) queue.add(current.getLeft());
                if (current.getRight() != null) queue.add(current.getRight());
            }

            result.add(level);
        }

        return result;
    }
}
