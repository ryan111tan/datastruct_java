package com.company;

public class WeightedUnionFind {

    public int size;
    public int[] arraySet;

    public WeightedUnionFind(int n) {
        this.arraySet = new int[n];
        for (int i = 0; i < n; i += 1){
            this.arraySet[i] = -1;
        }
        this.size = n;
    }

    //Validates if v1 is a vertex inside of the UnionFind.
    public void validate(int v1){
        if (v1 >= this.size || v1 < 0) {
            throw new RuntimeException(("This vertex is not validated"));
        }
    }

    //Return the size of set the vertex belongs to
    public int sizeOf(int v1){
        validate(v1);
        int root = find(v1);
        return arraySet[root] * -1;
    }

    //Return the parent of the vertex. If it is a root, return the negative value of the set that v1 is the root of.
    public int parent(int v1){
        validate(v1);
        return arraySet[v1];
    }

    //Check if two vertices are connected
    public boolean connected(int v1, int v2){
        validate(v1);
        validate(v2);
        return (find(v1) == find(v2));
    }


    //Combine the two vertices together
    public void union(int v1, int v2){
        validate(v1);
        validate(v2);

        if(sizeOf(v1) > sizeOf(v2)){
            arraySet[find(v1)] += arraySet[find(v2)];
            arraySet[find(v2)] = find(v1);
        }
        else {
            arraySet[find(v2)] += arraySet[find(v1)];
            arraySet[find(v1)] = find(v2);
        }

    }

    //Find the root of the vertex in question.
    public int find(int v1) {
        validate(v1);
        if (arraySet[v1] < 0) {
            return v1;
        }

        while(arraySet[v1] >= 0) {
            v1 = arraySet[v1];
        }
        return v1;

    }
}
