# My Compose Desktop

A personal playground repository created to explore and learn **Compose Multiplatform (CMP)** and **Kotlin Multiplatform (KMP)**, focusing on building desktop applications.

The goal of this project is to understand how shared Kotlin codebases work alongside desktop-specific UI implementations, state handling, and application lifecycles using Jetpack Compose principles on the JVM.

## What I'm Exploring Here

- Setting up project structure with shared code (`commonMain`) and target-specific modules (`desktopApp`).
- Compose UI patterns for desktop windows, layouts, and desktop navigation.
- State management and resource sharing across modules.
- Gradle configurations for Kotlin Multiplatform and desktop packaging.

## Tech Stack

- **Language:** Kotlin
- **Framework:** Compose Multiplatform (Desktop / JVM)
- **Build System:** Gradle (Kotlin DSL)

## Getting Started

To run the desktop application locally, make sure you have a compatible JDK installed (JDK 17 or higher recommended), clone the repository, and execute:

```bash
./gradlew :desktopApp:run
