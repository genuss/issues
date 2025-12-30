plugins {
	application
}

dependencies {
	implementation(project(":core"))
	implementation("tools.jackson.module:jackson-module-kotlin")
	implementation(platform("tools.jackson:jackson-bom:3.0.3"))
}

application {
	mainClass.set("com.example.jackson3.Jackson3MainKt")
}
