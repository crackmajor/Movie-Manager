import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieID {
    private int movieID;
    private String movieTitle;
    private String movieGenre;
    private int moviePrice;
}
