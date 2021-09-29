package GeometricFigure.Figures;

public enum ColorFigure {
    RED {
        public String getColor() {
            return "Красный";
        }
    },
    ORANGE {
        public String getColor() {
            return "Оранжевый";
        }
    },
    YELLOW {
        public String getColor() {
            return "Желтый";
        }
    },
    GREEN {
        public String getColor() {
            return "Зеленый";
        }
    },
    BLUE {
        public String getColor() {
            return "Голубой";
        }
    },
    INDIGO {
        public String getColor() {
            return "Синий";
        }
    },
    VIOLET {
        public String getColor() {
            return "Фиолетовый";
        }
    };

    public abstract String getColor();
}
