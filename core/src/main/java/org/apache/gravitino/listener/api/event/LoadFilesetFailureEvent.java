/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.gravitino.listener.api.event;

import org.apache.gravitino.NameIdentifier;
import org.apache.gravitino.annotation.DeveloperApi;

/** Represents an event that occurs when an attempt to load a fileset into the system fails. */
@DeveloperApi
public final class LoadFilesetFailureEvent extends FilesetFailureEvent {
  /**
   * Constructs a new {@code FilesetFailureEvent} instance.
   *
   * @param user The user associated with the failed fileset operation.
   * @param identifier The identifier of the fileset that was involved in the failed operation.
   * @param exception The exception that was thrown during the fileset operation, indicating the
   *     cause of the failure.
   */
  public LoadFilesetFailureEvent(String user, NameIdentifier identifier, Exception exception) {
    super(user, identifier, exception);
  }

  /**
   * Returns the type of operation.
   *
   * @return the operation type.
   */
  @Override
  public OperationType operationType() {
    return OperationType.LOAD_FILESET;
  }
}
