package org.infinispan.common;

import java.util.HashMap;
import java.util.Map;

public final class AppData {

   public static final String I8N_CONTRIBUTORS_CACHE_NAME = "i8n-contributors";

   private AppData() {

   }

   public static Map<Integer, Contributor> getContributors() {
      Map<Integer, Contributor> contributors = new HashMap<>();

      contributors.put(0, new Contributor(0, "Tristan Tarrant"));
      contributors.put(1, new Contributor(1, "Galder Zamarreño"));

      return contributors;
   }
}
