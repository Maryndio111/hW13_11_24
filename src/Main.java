import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    /*    Дан список строк вида “параметр:значение”
    (например, “length:8”, “name:Jack”  и т.д).
     Используя стримы получить  map, где параметр – это ключ,
      его значение – значение. При этом, если в списке дважды встретился один и
      тот же параметр, то значения должны быть указаны через запятую
        Например дано::  “name:Nick”,“length:8”, “name:Jack”
        Вывод:  [ name - Nick,Jack ;  length -> 8]*/
        import java.util.*;
import java.util.stream.*;

        public class Main {
            public static void main(String[] args) {
                List<String> input = Arrays.asList("name:Nick", "length:8", "name:Jack");

                Map<String, String> resultMap = input.stream()
                        .map(s -> s.split(":", 2)) // Разделяем строку на ключ и значение
                        .collect(Collectors.toMap(
                                arr -> arr[0], // ключ - первая часть (параметр)
                                arr -> arr[1], // значение - вторая часть (значение)
                                (existingValue, newValue) -> existingValue + "," + newValue // если ключ уже существует, объединяем значения через запятую
                        ));

                System.out.println(resultMap);
            }
        }




