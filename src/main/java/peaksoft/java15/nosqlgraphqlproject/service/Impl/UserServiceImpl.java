package peaksoft.java15.nosqlgraphqlproject.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.java15.nosqlgraphqlproject.dto.request.AuthRequest;
import peaksoft.java15.nosqlgraphqlproject.dto.response.AuthResponse;
import peaksoft.java15.nosqlgraphqlproject.entity.User;
import peaksoft.java15.nosqlgraphqlproject.repository.UserRepository;
import peaksoft.java15.nosqlgraphqlproject.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public AuthResponse auth(AuthRequest authRequest) {

        User user = new User();
        user.setName(authRequest.getName());
        user.setEmail(authRequest.getEmail());
        user.setAge(authRequest.getAge());
        User saveUser = userRepository.save(user);

        return new AuthResponse(
                saveUser.getName(),
                saveUser.getEmail(),
                saveUser.getAge()
        );
    }
}
