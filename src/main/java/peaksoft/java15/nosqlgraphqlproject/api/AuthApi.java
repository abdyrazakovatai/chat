package peaksoft.java15.nosqlgraphqlproject.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.java15.nosqlgraphqlproject.dto.request.AuthRequest;
import peaksoft.java15.nosqlgraphqlproject.dto.response.AuthResponse;
import peaksoft.java15.nosqlgraphqlproject.service.UserService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthApi {
    private final UserService userService;

    @PostMapping("/auth")
    public AuthResponse createUser(@RequestBody AuthRequest authRequest) {
       return userService.auth(authRequest);
    }
}
