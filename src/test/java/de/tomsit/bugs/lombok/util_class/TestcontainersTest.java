package de.tomsit.bugs.lombok.util_class;

import static org.assertj.core.api.Assertions.assertThat;

import dasniko.testcontainers.keycloak.KeycloakContainer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


class TestcontainersTest {


  @Timeout(value = 20)
  @Test
  void dummyTest() {
    var keycloak = new KeycloakContainer("quay.io/keycloak/keycloak:26.0.5")
        .withProviderClassesFrom("target/classes");

    keycloak.start();
    assertThat(keycloak.isRunning()).isTrue();
  }

}
