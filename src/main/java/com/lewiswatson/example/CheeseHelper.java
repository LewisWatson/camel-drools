/**
 *  Copyright 2005-2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package com.lewiswatson.example;

import java.util.Random;

public class CheeseHelper {

    private final Random random = new Random();

    public Cheese createTestCheese() {
        Cheese cheese = new Cheese();
        if (random.nextBoolean()) {
            cheese.setType("Stilton");
            cheese.setPrice(10);
        } else {
            cheese.setType("Cheddar");
            cheese.setPrice(50);
        }
        return cheese;
    }

}
