import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<LocalDateTime> list = new ArrayList<LocalDateTime>();
        list.add(LocalDateTime.now());
        list.add(LocalDateTime.of(2016,3,7,8,17,13));
        list.add(LocalDateTime.of(2018,4,5,6,16,13));
        list.add(LocalDateTime.of(2015,5,6,11,13,13));
        ArrayList<LocalDateTime> sortedList = new ArrayList<LocalDateTime>(list);
        Comparator < LocalDateTime > comparatorDate =
                Comparator.comparing( ( LocalDateTime ldt ) -> ldt.toLocalDate() );

        Comparator < LocalDateTime > comparatorTime =
                Comparator.comparing( ( LocalDateTime ldt ) -> ldt.toLocalTime() );

        Comparator < LocalDateTime > comparatorDateThenTime =
                comparatorDate.thenComparing(comparatorTime);

        sortedList.sort( comparatorDateThenTime );
        System.out.println(list);
        System.out.println(sortedList);
        System.out.println();

        ArrayList<LocalDateTime> list1 = new ArrayList<LocalDateTime>();
        list1.add(LocalDateTime.now());
        list1.add(LocalDateTime.of(2016,3,7,8,17,13));
        list1.add(LocalDateTime.of(2018,4,5,6,16,13));
        list1.add(LocalDateTime.of(2015,5,6,11,13,13));
        ArrayList<LocalDateTime> sortedList1 = new ArrayList<LocalDateTime>(list);
        Comparator < LocalDateTime > comparatorDate1 =
                Comparator.comparing( ( LocalDateTime ldt ) -> ldt.toLocalDate() ).reversed();

        Comparator < LocalDateTime > comparatorTime1 =
                Comparator.comparing( ( LocalDateTime ldt ) -> ldt.toLocalTime() ).reversed();

        Comparator < LocalDateTime > comparatorDateThenTime1 =
                comparatorDate1.thenComparing(comparatorTime1);

        sortedList1.sort( comparatorDateThenTime1 );
        System.out.println(list1);
        System.out.println(sortedList1);
    }
}
