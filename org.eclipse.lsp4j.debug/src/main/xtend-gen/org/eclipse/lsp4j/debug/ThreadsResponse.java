/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import java.util.Arrays;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'threads' request.
 */
@SuppressWarnings("all")
public class ThreadsResponse {
  /**
   * All threads.
   */
  @NonNull
  private org.eclipse.lsp4j.debug.Thread[] threads;
  
  /**
   * All threads.
   */
  @Pure
  @NonNull
  public org.eclipse.lsp4j.debug.Thread[] getThreads() {
    return this.threads;
  }
  
  /**
   * All threads.
   */
  public void setThreads(@NonNull final org.eclipse.lsp4j.debug.Thread[] threads) {
    this.threads = threads;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threads", this.threads);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ThreadsResponse other = (ThreadsResponse) obj;
    if (this.threads == null) {
      if (other.threads != null)
        return false;
    } else if (!Arrays.deepEquals(this.threads, other.threads))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.threads== null) ? 0 : Arrays.deepHashCode(this.threads));
  }
}
