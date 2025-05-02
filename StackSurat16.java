public class StackSurat16 {
    Surat16[] stack;
    int top;
    int size;

    public StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isFull() { 
        if(top == size -1){
            return true;
        }else{
            return false;
        } 
    }

    public boolean isEmpty(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Surat16 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima!");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()){
            return stack[top--];
        }else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) return stack[top];
        else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void search(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
