package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.KeyPairKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public interface Project1
    extends
    Augmentation<Project>
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project1.class;
    }
    
    /**
     * Used to configure the list of public keys to be injected as part of ns
     * instantiation
     *
     *
     *
     * @return <code>java.util.Map</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    @Nullable Map<KeyPairKey, KeyPair> getKeyPair();
    
    /**
     * @return <code>java.util.Map</code> <code>keyPair</code>, or an empty list if it is not present
     */
    default @NonNull Map<KeyPairKey, KeyPair> nonnullKeyPair() {
        return CodeHelpers.nonnull(getKeyPair());
    }

}

