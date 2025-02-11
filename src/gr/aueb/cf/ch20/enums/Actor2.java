package gr.aueb.cf.ch20.enums;

public enum Actor2 {
    CIVILIAN {
        @Override
        public String toRole() {
            return "ROLE_CIVILIAN";
        }
    },
    EMPLOYEE {
        @Override
        public String toRole() {
            return "EMPLOYEE";
        }
    },
    SUPER_ADMIN {
        @Override
        public String toRole() {
            return "ROLE_SUPER_ADMIN";
        }
    };

    public abstract String toRole();
}
