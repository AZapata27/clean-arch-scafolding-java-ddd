rootProject.name = "clean-arch-scafolding-java-ddd"

include("domain")
include("infrastructure")

include("application:entrypoints")
findProject(":application:entrypoints")?.name = "entrypoints"

include("application:workers")
findProject(":application:workers")?.name = "workers"

include("tests:acceptance-test")
findProject(":tests:acceptance-test")?.name = "acceptance-test"

include("tests:architecture-test")
findProject(":tests:architecture-test")?.name = "architecture-test"

include("tests:integration-test")
findProject(":tests:integration-test")?.name = "integration-test"
