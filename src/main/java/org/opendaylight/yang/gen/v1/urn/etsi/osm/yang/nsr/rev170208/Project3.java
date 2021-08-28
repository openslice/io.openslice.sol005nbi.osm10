package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Project3
    extends
    Augmentation<Project>
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project3> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project3.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata</code> <code>nsInstanceOpdata</code>, or <code>null</code> if not present
     */
    @Nullable NsInstanceOpdata getNsInstanceOpdata();

}

