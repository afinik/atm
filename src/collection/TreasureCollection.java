package collection;

import app.domain.Treasure;

public class TreasureCollection {
    private Treasure[] list;
    private int count;

    public TreasureCollection(){
        this(10);
    }

    public TreasureCollection(int capacity){
        if(capacity < 1)
            throw new RuntimeException("Negative capacity");
        list = new Treasure[capacity];
    }

    public void add(Treasure treasure){
        if(count == list.length){
            expand();
        }
        list[count] = treasure;
        count++;
    }

    public void remove(Treasure treasure){
        int indx = 1;
        if (treasure != null){
            for (Treasure trs: list) {
                if (treasure.equals(trs)){
                    System.arraycopy(list,indx,list,indx-1,list.length-indx);
                    count--;
                }
                indx++;
            }
        }
    }

    public void remove(int indx){
        checkIndex(indx);
        System.arraycopy(list,indx,list,indx-1,list.length-indx);
        count--;
    }

    public int size(){
        return this.count;
    }

    private void expand() {
        Treasure tmp[] = new Treasure[count*2+1];
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
        return list[indx];
    }



}
