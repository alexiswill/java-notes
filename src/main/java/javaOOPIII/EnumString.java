package javaOOPIII;

enum S {
    SMALL {

        // overriding toString() for SMALL
        public String toString() {
            return "The size is small.";
        }
    },

    MEDIUM {

        // overriding toString() for MEDIUM
        public String toString() {
            return "The size is medium.";
        }
    };
}

class EnumString {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
    }
}
