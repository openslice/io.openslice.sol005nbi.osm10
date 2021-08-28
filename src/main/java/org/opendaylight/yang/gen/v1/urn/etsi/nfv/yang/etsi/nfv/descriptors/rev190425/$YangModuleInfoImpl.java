package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;

import com.google.common.collect.ImmutableSet;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final @NonNull QName NAME = QName.create("urn:etsi:nfv:yang:etsi-nfv-descriptors", "2019-04-25", "etsi-nfv-descriptors").intern();
    private static final @NonNull YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final @NonNull ImmutableSet<YangModuleInfo> importedModules;

    public static @NonNull YangModuleInfo getInstance() {
        return INSTANCE;
    }

    public static @NonNull QName qnameOf(final String localName) {
        return QName.create(NAME, localName).intern();
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(EtsiNfvNsInfo.getInstance());
        set.add(EtsiNfvCommonInfo.getInstance());
        set.add(EtsiNfvVnfInfo.getInstance());
        set.add(EtsiNfvPnfInfo.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @Override
    public QName getName() {
        return NAME;
    }
    
    @Override
    protected String resourceName() {
        return "/META-INF/yang/etsi-nfv-descriptors@2019-04-25.yang";
    }
    
    @Override
    public ImmutableSet<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    private static final class EtsiNfvNsInfo extends ResourceYangModuleInfo {
        private final @NonNull QName NAME = QName.create("urn:etsi:nfv:yang:etsi-nfv-descriptors", "2019-04-25", "etsi-nfv-ns").intern();
        private static final @NonNull YangModuleInfo INSTANCE = new EtsiNfvNsInfo();
    
        private final @NonNull ImmutableSet<YangModuleInfo> importedModules;
    
        public static @NonNull YangModuleInfo getInstance() {
            return INSTANCE;
        }
    
        private EtsiNfvNsInfo() {
            importedModules = ImmutableSet.of();
        }
        
        @Override
        public QName getName() {
            return NAME;
        }
        
        @Override
        protected String resourceName() {
            return "/META-INF/yang/etsi-nfv-ns@2019-04-25.yang";
        }
        
        @Override
        public ImmutableSet<YangModuleInfo> getImportedModules() {
            return importedModules;
        }
    }
    
    private static final class EtsiNfvCommonInfo extends ResourceYangModuleInfo {
        private final @NonNull QName NAME = QName.create("urn:etsi:nfv:yang:etsi-nfv-descriptors", "2019-04-25", "etsi-nfv-common").intern();
        private static final @NonNull YangModuleInfo INSTANCE = new EtsiNfvCommonInfo();
    
        private final @NonNull ImmutableSet<YangModuleInfo> importedModules;
    
        public static @NonNull YangModuleInfo getInstance() {
            return INSTANCE;
        }
    
        private EtsiNfvCommonInfo() {
            importedModules = ImmutableSet.of();
        }
        
        @Override
        public QName getName() {
            return NAME;
        }
        
        @Override
        protected String resourceName() {
            return "/META-INF/yang/etsi-nfv-common@2019-04-25.yang";
        }
        
        @Override
        public ImmutableSet<YangModuleInfo> getImportedModules() {
            return importedModules;
        }
    }
    
    private static final class EtsiNfvVnfInfo extends ResourceYangModuleInfo {
        private final @NonNull QName NAME = QName.create("urn:etsi:nfv:yang:etsi-nfv-descriptors", "2019-03-18", "etsi-nfv-vnf").intern();
        private static final @NonNull YangModuleInfo INSTANCE = new EtsiNfvVnfInfo();
    
        private final @NonNull ImmutableSet<YangModuleInfo> importedModules;
    
        public static @NonNull YangModuleInfo getInstance() {
            return INSTANCE;
        }
    
        private EtsiNfvVnfInfo() {
            Set<YangModuleInfo> set = new HashSet<>();
            set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.$YangModuleInfoImpl.getInstance());
            set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.$YangModuleInfoImpl.getInstance());
            importedModules = ImmutableSet.copyOf(set);
        }
        
        @Override
        public QName getName() {
            return NAME;
        }
        
        @Override
        protected String resourceName() {
            return "/META-INF/yang/etsi-nfv-vnf@2019-03-18.yang";
        }
        
        @Override
        public ImmutableSet<YangModuleInfo> getImportedModules() {
            return importedModules;
        }
    }
    
    private static final class EtsiNfvPnfInfo extends ResourceYangModuleInfo {
        private final @NonNull QName NAME = QName.create("urn:etsi:nfv:yang:etsi-nfv-descriptors", "2019-04-25", "etsi-nfv-pnf").intern();
        private static final @NonNull YangModuleInfo INSTANCE = new EtsiNfvPnfInfo();
    
        private final @NonNull ImmutableSet<YangModuleInfo> importedModules;
    
        public static @NonNull YangModuleInfo getInstance() {
            return INSTANCE;
        }
    
        private EtsiNfvPnfInfo() {
            importedModules = ImmutableSet.of();
        }
        
        @Override
        public QName getName() {
            return NAME;
        }
        
        @Override
        protected String resourceName() {
            return "/META-INF/yang/etsi-nfv-pnf@2019-04-25.yang";
        }
        
        @Override
        public ImmutableSet<YangModuleInfo> getImportedModules() {
            return importedModules;
        }
    }
}
