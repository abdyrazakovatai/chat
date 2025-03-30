package peaksoft.java15.nosqlgraphqlproject.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class AuthResponse {
    private String name;
    private String email;
    private int age;
}
