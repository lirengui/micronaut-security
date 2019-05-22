/*
 * Copyright 2017-2019 original authors
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
package io.micronaut.security.oauth2.configuration;

import io.micronaut.core.util.Toggleable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

/**
 * OAuth 2.0 Configuration
 *
 * @author James Kleeh
 * @since 1.2.0
 */
public interface OauthConfiguration extends Toggleable {

    /**
     *
     * @return the login Uri
     */
    @Nonnull
    String getLoginUri();

    /**
     * @return the Callback Uri
     */
    @Nonnull
    String getCallbackUri();

    /**
     * @return the default authorization provider
     */
    @Nullable
    Optional<String> getDefaultProvider();

    /**
     *
     * @return OpenID Connect Configuration
     */
    @Nonnull
    OpenIdConfiguration getOpenid();
}
