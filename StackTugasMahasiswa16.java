public class StackTugasMahasiswa16 {

    Mahasiswa16[] stack;
    int top;
    int size;

    public StackTugasMahasiswa16(){

    }

    public StackTugasMahasiswa16(int size){
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
    }

    public boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }

    // public boolean isEmpty(){
    //     if(top == size -1){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    //pertanyaan
    public boolean isEmpty(){
        return top == -1;
    }
    
    public void push(Mahasiswa16 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa16 pop(){
        if(!isEmpty()){
            Mahasiswa16 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // public Mahasiswa16 peek(){
    //     if(!isEmpty()){
    //         Mahasiswa16 m = stack[top];
    //         top--;
    //         return m;
    //     }else{
    //         System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
    //         return null;
    //     }
    // }

    //pertanyaan
    public Mahasiswa16 peek(){
        if(!isEmpty()){
            return stack[top]; // Tanpa top--
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    

    public void print(){
        for(int i = top; i >= 0; i--){// kalau mau dari atas ubah menjadi (int i <= 0; i <= top; i++)
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa16 bottom() {
        return stack[0]; // Menampilkan elemen pertama
    }
    
    public int jumlahTugas() {
        return top + 1;
    }    
}