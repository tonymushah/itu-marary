import { Symptome as SymptomeApi } from "$lib/api/Symptome";
import type { Symptome } from "$lib/api/data-contracts";
import type { PageServerLoad as PageLoad } from "./$types";

export const load: PageLoad = async () => {
    const client = new SymptomeApi();
    
    const symptopmes: Symptome = await (await client.getAll1()).json();
    console.log(symptopmes);
    return {
        symptopmes
    }
}