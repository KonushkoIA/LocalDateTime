//создавал для сортировки просто компаратором
import java.util.Comparator;
import java.time.LocalDateTime;

class LocalDateTimeComparator implements Comparator<LocalDateTime> {
    @Override
    public int compare(LocalDateTime a, LocalDateTime b) {
        int res = a.toLocalDate().compareTo(b.toLocalDate());
        if ( 0 == res ) {
            res = a.toLocalTime().compareTo(b.toLocalTime());
        }
        return res;
    }
}
