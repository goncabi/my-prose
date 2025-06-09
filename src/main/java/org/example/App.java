/*
 * Copyright (C) 2025 Gabriela Goncalvez
 *
 * This file is part of the my-prose project.
 *
 * my-prose is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * my-prose is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */


package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java App archivo.txt");
            return;
        }

        Path path = Path.of(args[0]);

        try {
            String content = Files.readString(path);
            long wordCount = content.trim().isEmpty() ? 0 : content.split("\\s+").length;
            long charCount = content.length();
            long lineCount;
            try (Stream<String> lines = Files.lines(path)) {
                lineCount = lines.count();
            }

            System.out.println("📄 Análisis del archivo: " + path.getFileName());
            System.out.println("Palabras: " + wordCount);
            System.out.println("Líneas: " + lineCount);
            System.out.println("Caracteres: " + charCount);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
