package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CpuFeatureType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.HostEpa;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of CPU features.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list cpu-feature {
 *   key feature;
 *   leaf feature {
 *     type cpu-feature-type;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa/cpu-feature</i>
 * 
 * <p>To create instances of this class use {@link CpuFeatureBuilder}.
 * @see CpuFeatureBuilder
 * @see CpuFeatureKey
 *
 */
public interface CpuFeature
    extends
    ChildOf<HostEpa>,
    Augmentable<CpuFeature>,
    Identifiable<CpuFeatureKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-feature");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.CpuFeature> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.CpuFeature.class;
    }
    
    /**
     * CPU feature.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CpuFeatureType</code> <code>feature</code>, or <code>null</code> if not present
     */
    @Nullable CpuFeatureType getFeature();
    
    @Override
    CpuFeatureKey key();

}

