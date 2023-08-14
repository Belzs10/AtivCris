package tv;

public class Tv {
        private boolean status = true;
        private int canal = 11;
        private int volume = 30;

    public Tv(boolean status, int canal, int volume) {
        this.status = status;
        this.canal = canal;
        this.volume = volume;
    }

    public void Ligar() {
            this.status = this.status;
            if (this.status) {
                this.canal = 1;
                this.volume = 0;
            }
        }

        public void Desligar(){
        this.status = !this.status;
        if (!this.status){
            this.canal = 0;
            this.volume = 0;
        }
        }
        public void alterarCanal(int newCanal) {
            if (this.status && (newCanal == 1 || newCanal == 3 || newCanal == 5 || newCanal == 7 || newCanal == 11)) {
            }else {
                System.out.println("Tv Desligada");
            }
                this.canal = newCanal;
            }

        public int aumentarVol() {
            if (this.status && this.volume < 100) {
                ++this.volume;
            }else{
                System.out.println("TV Desligada");
            }
            return volume;
        }

        public void diminuirVol() {
            if (this.status && this.volume > 0) {
                --this.volume;
            }

        }

    @Override
    public String
    toString() {
        return "Tv" +
                "\nstatus: " + status +
                "\ncanal " + canal +
                "\nvolume " + volume;
    }
}


  //  public void mostrarStatus() {
  //      String status = this.ligada ? "ligada" : "desligada";
 //   }


