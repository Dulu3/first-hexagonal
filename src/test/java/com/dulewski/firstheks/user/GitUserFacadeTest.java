package com.dulewski.firstheks.user;


import com.dulewski.firstheks.user.dto.GitUserResponse;
import com.dulewski.firstheks.user.infrastructure.UserProperties;
import com.dulewski.firstheks.user.infrastructure.gituser.GitUsersPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GitUserFacadeTest {

    private final GitUsersPort port = mock(GitUsersPort.class);
    private final UserRepository repository = new InMemoryGitRepository();
    private final UserProperties userProperties = new UserProperties(2);
    private final UserConfig.UserPropertiesConfig userPropertiesConfig = new UserConfig.UserPropertiesConfig(userProperties);
    private final UserFacade userFacade = new UserConfig().createUserFacadeTest(repository, port, userPropertiesConfig);

    @Test
    void contextLoads1() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jan");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads2() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Anna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads3() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kamil");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads4() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads5() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ewa");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads6() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Piotr");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads7() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Katarzyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads8() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Tomasz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads9() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Szymon");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads10() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Natalia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads11() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Łukasz");
        //THEN
        Assertions.assertAll(() -> Assertions.assertEquals(79691238, data.id()));
    }

    @Test
    void contextLoads12() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Magdalena");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads13() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Grzegorz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads14() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Paulina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads15() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Wojciech");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads16() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jakub");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads17() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Piotr");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads18() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Daria");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads19() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Sebastian");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads20() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ewelina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads21() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kamil");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads22() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zbigniew");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads23() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Monika");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads24() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Paweł");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads25() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Olga");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads26() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Rafał");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads27() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Weronika");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads28() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Igor");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads29() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Sandra");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads30() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Michał");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads31() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Beata");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads32() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Iwona");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads33() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Karolina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads34() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Maciej");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads35() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Michał");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads36() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zofia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads37() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jakub");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads38() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Maja");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads39() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jan");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads40() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Hanna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads41() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Wiktoria");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads42() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ewa");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads43() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads44() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Dominik");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads45() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Dawid");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads46() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Krzysztof");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads47() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zbigniew");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads48() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Gabriela");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads49() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Grzegorz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads50() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Błażej");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads51() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zofia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads52() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Karolina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads53() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marta");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads54() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Lena");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads55() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Anita");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads56() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Magda");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads57() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Rafał");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads58() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Robert");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads59() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Justyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads60() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Lukasz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads61() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jacek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads62() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Adam");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads63() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Bartek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads64() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Sylwia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads65() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kamil");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads66() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Anita");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads67() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Pawel");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads68() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Mateusz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads69() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Renata");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads70() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Daniel");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads71() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Damian");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads72() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kamila");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads73() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ilona");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads74() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Tomasz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads75() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kasia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads76() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads77() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Sylwia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads78() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Barbara");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads79() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jolanta");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads80() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ewa");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads81() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Agnieszka");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads82() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Joanna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads83() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Mieczysław");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }
    @Test
    void contextLoads84() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Tadeusz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads85() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Roman");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads86() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zbigniew");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads87() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Wojciech");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads88() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Stefan");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads89() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Eugeniusz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads90() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Krzysztof");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads91() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Krystyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads92() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Adrian");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads93() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Paweł");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads94() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Alina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads95() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Mariusz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads96() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Seweryn");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads97() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Mieczysław");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads98() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Waldemar");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads99() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Joanna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads100() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zofia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads101() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Feliks");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads102() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marcel");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads103() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Witold");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads104() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Bartosz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads105() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Andrzej");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads106() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads107() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Monika");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads108() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Sylwia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads109() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Grażyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads110() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Tomasz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads111() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Leszek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads112() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Roman");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads113() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Katarzyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads114() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zbigniew");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads115() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Izabela");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads116() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Błażej");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads117() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Konrad");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads118() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kamil");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads119() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Alicja");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads120() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jacek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads121() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Iwona");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads122() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Dorota");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads123() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Aneta");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads124() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Monika");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads125() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Wiesław");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads126() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Kazimierz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads127() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Władysław");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads128() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Karolina");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads129() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Renata");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads130() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Barbara");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads131() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ryszard");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads132() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marek");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads133() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ludwik");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads134() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Joanna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads135() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Patryk");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads136() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Natalia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads137() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Piotr");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads138() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Aleksander");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads139() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Waldemar");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads140() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zdzisław");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads141() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Tadeusz");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads142() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Piotr");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads143() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Krzysztof");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads144() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Adam");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads145() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Michał");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads146() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Ewa");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads147() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Marta");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads148() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Katarzyna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads149() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Gabriela");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads150() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Irena");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads151() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Jan");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads152() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Natalia");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads153() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Zuzanna");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads154() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Olga");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads155() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Karol");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads156() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Wojciech");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads157() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Agnieszka");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads158() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Anastazja");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads159() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Izabela");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    @Test
    void contextLoads160() {
        //GIVEN
        when(port.getUser(anyString())).thenReturn(createTestResponse());
        //WHEN
        var data = userFacade.getPrestigePointsAndSaveUser("Lena");
        //THEN
        Assertions.assertAll(() -> {
            Assertions.assertEquals(79691238, data.id());
        });
    }

    private static GitUserResponse createTestResponse() {
        return new GitUserResponse(79691238,"Piotr",2,2);
    }

}
