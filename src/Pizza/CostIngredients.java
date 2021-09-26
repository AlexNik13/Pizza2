package Pizza;

public enum CostIngredients {
    doughCostKg {private double doughCostKg = 50;

        public double getCost() {
            return doughCostKg;
        }
    },
    cheeseCostKg {private double cheeseCostKg = 248;

        public double getCost() {
            return cheeseCostKg;
        }
    },
    sauseCostKg {private double sauseCostKg = 85;

        public double getCost() {
            return sauseCostKg;
        }
    },
    tomatoCostKg {private double tomatoCostKg = 35;

        public double getCost() {
            return tomatoCostKg;
        }
    },
    meatCostKg {private double meatCostKg = 125;

        public double getCost() {
            return meatCostKg;
        }
    },
    baconCostKg {private double baconCostKg = 135;

        public double getCost() {
            return baconCostKg;
        }
    },
    mushroomsCostKg {private double mushroomsCostKg = 50;

        public double getCost() {
            return mushroomsCostKg;
        }
    },
    onionCostKg {private double onionCostKg = 50; public double getCost(){return onionCostKg;}},
    hamCostKg {private double hamCostKg = 50; public double getCost(){return hamCostKg;}},
    sausageCostKg {private double sausageCostKg = 50; public double getCost(){return sausageCostKg;}},
    bellPepperCostKg {private double bellPepperCostKg = 50; public double getCost(){return bellPepperCostKg;}},
    broccoliCostKg {private double broccoliCostKg = 50; public double getCost(){return broccoliCostKg;}},
    olivesCostKg {private double olivesCostKg = 50; public double getCost(){return olivesCostKg;}};


    public abstract double getCost();

}

