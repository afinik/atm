package collection;

import app.domain.Treasure;

public class TreasureCollection {
    private Treasure[] list;
    private int count;

    public TreasureCollection(){
        this(10);
    }

    public TreasureCollection(int capacity){
        list = new Treasure[capacity];
    }

    public void add(){}

    public void delete(){}

    public int size(){
        return this.count;
    }

    private void expand() {
        Treasure tmp[] = new Treasure[count*2];
        System.arraycopy(list,0,tmp,0,count);
        list = tmp;
    }

    private void checkIndex(int index) {
        if(index > this.count || index < 0){
            throw new RuntimeException("index out of range");
        }
    }

    public Treasure get(int indx){
        checkIndex(indx);
        return list[indx]
    }



}
