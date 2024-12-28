
// 21.Define class MyDate with members day, month, year. Define default and parameterized constructors.
//  Accept values from the command line and create a date object.
//   Throw user defined exceptions – nvalidDayException or InvalidMonthException
//   if the day and month are invalid. If the date is valid, display message “Valid date 


public class MyDate {
    int day, month, year;

    public MyDate(int d, int m, int y) throws InvalidMonthException, InvalidDayException {
        day = d;
        month = m;
        year = y;
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month");
        }
        int monthdays = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            monthdays = 30;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                monthdays = 29;
            } else {
                monthdays = 28;
            }
        }

        if (day < 1 || day > monthdays) {
            throw new InvalidDayException("Invalid date..");
        }
    }

   
    public static void main(String ar[]) {
        int day, month, year;
        if (ar.length != 3) {
            System.out.println("Enter 3 arguments with format (day,month,year)");
        } else {
            day = Integer.parseInt(ar[0]);
            month = Integer.parseInt(ar[1]);
            year = Integer.parseInt(ar[2]);
            try {
                MyDate obj = new MyDate(day, month, year);
                System.out.println("Valid date \n Date is : " + day + "/" + month + "/" + year);
            } catch (InvalidMonthException | InvalidDayException e) {
                System.out.println(e.getMessage());
                ;
            }

        }

    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String Message) {
        System.out.println(Message);
    }
}

class InvalidDayException extends Exception {
    public InvalidDayException(String Message) {
        System.out.println(Message);
    }
}