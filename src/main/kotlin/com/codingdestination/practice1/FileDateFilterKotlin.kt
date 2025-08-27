import java.util.List;
import java.time.format.DateTimeFormatter
import java.time.ZoneId

public class FileDateFilterKotlin(private val dirPath:String) {

    private val formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    private val kolkata = ZoneId.of("Asia/Kolkata")

    fun filter(thresholdKolkataStr:String = "2025/02/02 00:00:00",
               fileZone: ZoneId = ZoneId.of("America/Los_Angeles")): List<File> {
        return listOf()
    }
    
}