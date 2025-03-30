package peaksoft.java15.nosqlgraphqlproject.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthRequest {
    private String name;
    private String email;
    private int age;
}
