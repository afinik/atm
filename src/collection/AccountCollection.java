package collection;

import app.domain.Account;

/**
 * Расширить класс AccountCollection  методами из интрефейса java.util.Deque
 */

public class AccountCollection {
    private Account[] list;
    int count = 0;

    public AccountCollection(){
        this.list = new Account[10];
    }

    public AccountCollection(int length){
        this.list = new Account[length];
    }

    public int size(){
        return this.count;
    }

    public void add(Account account){
        if(count == list.length){
            expand();
        }
        list[count] = account;
        count++;
    }

    private void expand() {
        Account tmp[] = new Account[count*2];
        System.arraycopy(list,0,tmp,0,count);
        list = tmp;
    }

    public Account get(int index){
        checkIndex(index);
        return list[index];
    }

    private void checkIndex(int index) {
        if(index > this.count || index < 0){
            throw new RuntimeException("index out of range");
        }
    }

    public void remove(Account account){
        int indx = 1;
        if (account != null){
            for (Account acc: list) {
                if (account.equals(acc)){
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



}
