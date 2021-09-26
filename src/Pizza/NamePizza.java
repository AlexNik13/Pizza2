package Pizza;

public enum NamePizza {
    MEAT{
        public String namePizza(){return  "Мясная пицца";}
        public int getDoughGram(){return  50;}
        public int getSauseGram(){return  10;}
        public int getTomatoGram(){return  50;}

        public int getCheeseGram(){return  100;}
        public int getMeatGram(){return  60;}
        public int getBaconGram(){return  0;}
        public int getMushroomsGram(){return  20;}
        public int getOnionGram(){return  0;}
        public int getHamGram(){return  30;}
        public int getSausageGram(){return  20;}
        public int getBellPepperGram(){return  0;}
        public int getBroccoliGram(){return  0;}
        public int getOlivesGram(){return  0;}
    },
    FARM{
        public String namePizza(){return  "Фермерская пицца";}
        public int getDoughGram(){return  50;}
        public int getSauseGram(){return  10;}
        public int getTomatoGram(){return  50;}

        public int getCheeseGram(){return  100;}
        public int getMeatGram(){return  30;}
        public int getBaconGram(){return  50;}
        public int getMushroomsGram(){return  30;}
        public int getOnionGram(){return  20;}
        public int getHamGram(){return  10;}
        public int getSausageGram(){return  20;}
        public int getBellPepperGram(){return  30;}
        public int getBroccoliGram(){return  0;}
        public int getOlivesGram(){return  0;}
    },
    VEGAN{
        public String namePizza(){
            return  "Вегетарианская пицца";

        }
        public int getDoughGram(){return  50;}
        public int getSauseGram(){return  10;}
        public int getTomatoGram(){return  50;}

        public int getCheeseGram(){return  100;}
        public int getMeatGram(){return  0;}
        public int getBaconGram(){return  0;}
        public int getMushroomsGram(){return  30;}
        public int getOnionGram(){return  30;}
        public int getHamGram(){return  0;}
        public int getSausageGram(){return  0;}
        public int getBellPepperGram(){return  50;}
        public int getBroccoliGram(){return  30;}
        public int getOlivesGram(){return  20;}
    },
     CUSTOMER{
        public String namePizza(){
            return  "Своя пицца";

        }
        public int getDoughGram(){return  50;}
        public int getSauseGram(){return  10;}
        public int getTomatoGram(){return  50;}

        public int getCheeseGram(){return  0;}
        public int getMeatGram(){return  0;}
        public int getBaconGram(){return  0;}
        public int getMushroomsGram(){return  0;}
        public int getOnionGram(){return  0;}
        public int getHamGram(){return  0;}
        public int getSausageGram(){return  0;}
        public int getBellPepperGram(){return  0;}
        public int getBroccoliGram(){return  0;}
        public int getOlivesGram(){return  0;}
    };


    public abstract String namePizza();
    public abstract  int getDoughGram();
    public abstract  int getSauseGram();
    public abstract  int getTomatoGram();

    public abstract  int getCheeseGram();
    public abstract  int getMeatGram();
    public abstract  int getBaconGram();
    public abstract  int getMushroomsGram();
    public abstract  int getOnionGram();
    public abstract  int getHamGram();
    public abstract  int getSausageGram();
    public abstract  int getBellPepperGram();
    public abstract  int getBroccoliGram();
    public abstract  int getOlivesGram();
}

