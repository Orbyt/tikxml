/*
 * Copyright (C) 2015 Hannes Dorfmann
 * Copyright (C) 2015 Tickaroo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tickaroo.tikxml.processor.scanning

import com.tickaroo.tikxml.processor.model.Field
import javax.lang.model.element.VariableElement
import javax.lang.model.util.Elements
import javax.lang.model.util.Types

/**
 * A [ScanStrategy] that scans the element only for annotations
 * @author Hannes Dorfmann
 */
class AnnotationOnlyScanStrategy(elementUtils: Elements, typeUtils: Types) : ScanStrategy(elementUtils, typeUtils) {
    override fun isXmlField(element: VariableElement): Field? {
        throw UnsupportedOperationException()
    }

}