package pl.akademiaspecjalistowit.streamapiinpractice.zadanie2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Zadanie2 {

    /**
     *
     * ZACZNIJ OD NAPISANIA ASERCJI!
     *
     * twórz funkcję, która przyjmuje listę słów i zwraca mapę,
     * gdzie kluczem jest długość słowa, a wartością ilość słów o tej długości.
     */
    @Test
    void grouping(){
        //given
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        //when
        Map<Integer, Long> wordCount = null;

        //then
        //assertThat()...
        System.out.println("Mapa długości słów do ich ilości: " + wordCount);

    }
}
