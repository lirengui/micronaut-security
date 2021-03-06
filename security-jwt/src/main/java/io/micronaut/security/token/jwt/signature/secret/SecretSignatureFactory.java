/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.token.jwt.signature.secret;

import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;

/**
 * Creates {@link SecretSignature} beans for each {@link SecretSignatureConfiguration} beans. Each {@link SecretSignature} is a bean of type {@link io.micronaut.security.token.jwt.signature.SignatureConfiguration} and {@link io.micronaut.security.token.jwt.signature.SignatureGeneratorConfiguration} as well.
 *
 * @author Sergio del Amo
 * @since 1.0
 */
@Factory
public class SecretSignatureFactory {

    /**
     * Creates {@link SecretSignature} for each {@link SecretSignatureConfiguration} bean.
     *
     * @param configuration {@link SecretSignatureConfiguration} bean.
     * @return The {@link SecretSignature}
     */
    @EachBean(SecretSignatureConfiguration.class)
    public SecretSignature signatureConfiguration(SecretSignatureConfiguration configuration) {
        return new SecretSignature(configuration);
    }
}
