package q1;


    public class Supervisor extends Worker{
        public String division;

        public Supervisor(String name, double wage, String division) {
            super(name, wage);
            this.division = division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getDivision() {
            return division;
        }

        @Override
        public String toString() {
            return "Worker [name=" + name + ", wage=" + wage + ", Division=" + division +"]";
        }
    }

