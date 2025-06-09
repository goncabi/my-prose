# my-prose

**my-prose** is a simple command-line tool written in Java that analyzes text files.  
It counts words, lines, and characters, and is designed to be lightweight, open, and extensible.

## ✨ Features

- Word, line, and character counting
- Support for plain text input
- Command-line usage
- Built with Maven

## 📦 Installation

You need **Java 11** or higher and **Maven** installed.

```bash
git clone https://github.com/goncabi/my-prose.git
cd my-prose
mvn package

``

This will generate a `.jar` file in the `target/` directory.

## ▶️ Usage

To analyze a text file:

```bash
java -cp target/my-prose-1.0-SNAPSHOT.jar org.example.App path/to/file.txt
```

Example:

```bash
java -cp target/my-prose-1.0-SNAPSHOT.jar org.example.App example.txt
```

## 🛠 Development

The main class is located in:

```
src/main/java/org/example/App.java
```

Feel free to contribute! See [`CONTRIBUTING.md`](CONTRIBUTING.md) for guidelines.

## 📄 License

This project is licensed under the **GNU General Public License v3.0 or later**.  
See the [LICENSE](LICENSE) file for more information.

## 🤝 Community

This project follows a [Code of Conduct](CODE_OF_CONDUCT.md) and welcomes contributions from everyone.  
If you find any issues or vulnerabilities, please follow the instructions in [SECURITY.md](SECURITY.md).

