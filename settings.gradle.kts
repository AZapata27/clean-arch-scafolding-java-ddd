rootProject.name = "clean-arch-scafolding-java-ddd"

include("domain")
include("application")
include("infrastructure")

include("presentation:entrypoints")
findProject(":presentation:entrypoints")?.name = "entrypoints"

include("presentation:workers")
findProject(":presentation:workers")?.name = "workers"

include("tests:acceptance-test")
findProject(":tests:acceptance-test")?.name = "acceptance-test"

include("tests:architecture-test")
findProject(":tests:architecture-test")?.name = "architecture-test"

include("tests:integration-test")
findProject(":tests:integration-test")?.name = "integration-test"

