/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.prixexcellencetourisme.server.services;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.Files;

public class FilesService {
    private static final String CODES_FILE = "codes.txt";

    private List<String> voteCodes;

    public List<String> getVoteCodes() {
        if (voteCodes == null) {
            try {
                File f = new File(getClass().getClassLoader().getResource(CODES_FILE).toURI());
                voteCodes = Files.readLines(f, Charset.defaultCharset());
            } catch (URISyntaxException | IOException | NullPointerException e) {
                voteCodes = new ArrayList<>();
            }
        }

        return voteCodes;
    }
}
