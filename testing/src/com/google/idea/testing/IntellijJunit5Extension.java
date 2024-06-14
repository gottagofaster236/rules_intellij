/*
 * Copyright 2022 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.testing;

import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Suite runner that sets up the intellij integration environment.
 *
 * <p>Usage: @ExtendWith(IntellijJunit5Extension.class) @Suite class MySuite {}
 */

public final class IntellijJunit5Extension implements BeforeTestExecutionCallback {
    @Override
    public void beforeTestExecution(ExtensionContext context) {
        System.out.println("IntellijJunit5Extension.beforeAll");
        System.exit(666);
        throw new RuntimeException("IntellijJunit5Extension.beforeAll");
//        BlazeTestSystemProperties.configureSystemProperties();
    }
}
